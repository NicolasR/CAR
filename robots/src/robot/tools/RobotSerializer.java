package robot.tools;

import generator.website.SimpleToURBI;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Map;

import javax.swing.filechooser.FileNameExtensionFilter;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import robot.Mission;
import robot.RobotPackage;

public class RobotSerializer {

	class OnlyExt implements FilenameFilter {
		  String ext;

		  public OnlyExt(String ext) {
		    this.ext = "." + ext;
		  }

		  public boolean accept(File dir, String name) {
		    return name.endsWith(ext);
		  }
		}
	
	public void generateUrbi(Mission mission){
		//SimpleToHTML est le nom de la classe g�n�r�e par JET � partir du template
		SimpleToURBI urbicode = new SimpleToURBI();
		String destdir = "generated";
		FileWriter output;
		BufferedWriter writer;
		System.out.println("Creating URBI Code");
		
		try {
			String[] fileList;
			File directory = new File("model" );
			FilenameFilter filter = new FilenameFilter(){
					public boolean accept(File dir, String name) {
						return name.endsWith(".xmi");
					}
			};

			fileList = directory.list(filter);
			for (String string : fileList) {
				String newname = string.replace(".xmi", ".u");
				output = new FileWriter(destdir+"/"+newname);
				writer = new BufferedWriter(output);
				System.out.println("Generate Urbi for "+string);
				
				//Appel de la m�thode generate de la classe g�n�r�e par JET
				writer.write(urbicode.generate(mission));
				writer.close();
			}
			System.out.println(fileList.length+" file(s) generated");
			

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
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
		Mission mission = robotSerializer.load(new File("model/Mission1.xmi"));
		robotSerializer.generateUrbi(mission);
	}

}
