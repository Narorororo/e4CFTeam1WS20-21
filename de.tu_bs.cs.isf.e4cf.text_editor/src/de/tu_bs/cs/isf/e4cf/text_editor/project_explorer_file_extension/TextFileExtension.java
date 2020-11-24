package de.tu_bs.cs.isf.e4cf.text_editor.project_explorer_file_extension;

import org.eclipse.swt.graphics.Image;
import de.tu_bs.cs.isf.e4cf.core.util.ServiceContainer;
import de.tu_bs.cs.isf.e4cf.core.util.services.RCPImageService;
import de.tu_bs.cs.isf.e4cf.parts.project_explorer.interfaces.IProjectExplorerExtension;

public class TextFileExtension implements IProjectExplorerExtension {
	public static final String TXT_FILE_OPENED = "OPEN_TXT_THNKS";
	
	@Override
	public Image getIcon(RCPImageService imageService) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void execute(ServiceContainer container) {
		System.out.println("Vorher TXT");	//placeholder
		container.eventBroker.send(TXT_FILE_OPENED, container.rcpSelectionService.getCurrentSelectionFromExplorer());
		System.out.println("Nachher TXT"); 	//placeholder

	}

}