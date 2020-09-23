package makereports;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.Buffer;

public class Report {

	private String nameFile;
	private String title;
	private String content;
	private String extension;

	// Metodos
	public String getNameFile() {
		return nameFile;
	}

	public void setNameFile(String nameFile) {
		this.nameFile = nameFile;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public void makeReport() {

		if ((getNameFile() != null) && (getTitle() != null) && (getContent() != null)) {
			// Crear Archivo
			try {
				File file = new File(getNameFile() + "." + getExtension());
				FileOutputStream fos = new FileOutputStream(file);
				OutputStreamWriter osw = new OutputStreamWriter(fos);
				BufferedWriter bw = new BufferedWriter(osw);
				bw.write(getContent());
				bw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Ingresa los datos del archivo.");
		}
	}

}
