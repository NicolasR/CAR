package robot.tools;

import generator.website.SimpleToURBI;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import robot.Mission;
import robot.RobotPackage;

/**
 * Effectue la g�n�ration du code Urbi � partir des missions d�finies
 * @author Thibault DUPERRON
 * @author Nicolas RIGNAULT
 *
 */
public class RobotSerializer {

	/**
	 * Filtrage pour les extensions .xmi
	 * @author Thibault DUPERRON
	 * @author Nicolas RIGNAULT
	 *
	 */
	class OnlyExt implements FilenameFilter {
		  String ext;

		  public OnlyExt(String ext) {
		    this.ext = "." + ext;
		  }

		  public boolean accept(File dir, String name) {
		    return name.endsWith(ext);
		  }
		}
	
	/**
	 * G�n�re le code urbi pour tous les fichiers .xmi
	 */
	public void generateUrbi(String src, String dest){
		//SimpleToHTML est le nom de la classe g�n�r�e par JET � partir du template
		SimpleToURBI urbicode = new SimpleToURBI();
		String srcdir = "model";
		if (src != null)
			srcdir = src;
		String destdir = "generated";
		if (dest != null)
			destdir = dest;
		FileWriter output;
		BufferedWriter writer;
		
		try {
			String[] fileList;
			File directory = new File(srcdir);
			FilenameFilter filter = new FilenameFilter(){
					public boolean accept(File dir, String name) {
						return name.endsWith(".xmi");
					}
			};

			fileList = directory.list(filter);
			if (fileList.length == 0)
			{
				System.out.println("No file found: nothing to do");
				System.exit(0);
			}
			System.out.println("Creating URBI Code");
			for (String string : fileList) {
				String newname = string.replace(".xmi", ".u");
				output = new FileWriter(destdir+"/"+newname);
				writer = new BufferedWriter(output);
				System.out.println("Generate Urbi for "+string);
				
				//Appel de la m�thode generate de la classe g�n�r�e par JET
				File mission = new File(srcdir+"/"+string);
				writer.write(urbicode.generate(load(mission)));
				writer.close();
			}
			System.out.println(fileList.length+" file(s) generated");
			

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Charge une mission en m�moire
	 * @param f le nom du fichier � charger
	 * @return la mission associ�e
	 */
	public Mission load(File f) {
		ResourceSet rs = new ResourceSetImpl();
		Resource.Factory.Registry registry =
		rs.getResourceFactoryRegistry();
		Map<String,Object> m = registry.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		rs.getPackageRegistry().put(RobotPackage.eNS_URI,
		RobotPackage.eINSTANCE);
		URI uri = URI.createFileURI(f.getAbsolutePath());
		Resource resource = rs.getResource(uri, true);
		if (resource.isLoaded() && resource.getContents().size() > 0) {
		return (Mission) resource.getContents().get(0);
		}
		return null;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RobotSerializer robotSerializer = new RobotSerializer();
		//Mission mission = robotSerializer.load(new File("model/Mission2.xmi"));
		if (args.length >= 2 && new File(args[0]).exists() && new File(args[1]).exists())
			robotSerializer.generateUrbi(args[0], args[1]);
		else
			robotSerializer.generateUrbi(null, null);
	}

}