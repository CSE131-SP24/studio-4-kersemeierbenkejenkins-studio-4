package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File

		String shape = in.next();
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		boolean d = in.nextBoolean();
		double e = in.nextDouble();
		double k = in.nextDouble();
		double g = in.nextDouble();
		double h = in.nextDouble();
		
		StdDraw.setPenColor(a,b,c);
		
		if(d == true) {
		StdDraw.filledRectangle(e,k,g,h);
		}
		
		else {
		StdDraw.rectangle(e,k,g,h);
		}
		
		
	}
}
