package robot.tools;

import generator.website.SimpleToURBI;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import robot.Mission;
import robot.RobotPackage;

public class RobotSerializer {

	public void generateUrbi(Mission mission){
		//SimpleToHTML est le nom de la classe générée par JET à partir du template
		SimpleToURBI urbicode = new SimpleToURBI();
		FileWriter output;
		BufferedWriter writer;
		System.out.println("Creating Mission URBI Code");
		
		try {
			output = new FileWriter("mission.u");
			writer = new BufferedWriter(output);
			
			//Appel de la méthode generate de la classe générée par JET
			writer.write(urbicode.generate(mission));
			writer.close();
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
