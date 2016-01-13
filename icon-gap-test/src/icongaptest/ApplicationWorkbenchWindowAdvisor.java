package icongaptest;

import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

    public ApplicationWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        super(configurer);
    }

    public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer) {
        return new ApplicationActionBarAdvisor(configurer);
    }
    
    public void preWindowOpen() {
    	 getWindowConfigurer().setInitialSize(new Point(1000, 700));
         getWindowConfigurer().setShowCoolBar(true);
         getWindowConfigurer().setShowMenuBar(true);
         getWindowConfigurer().setShowStatusLine(true);
         getWindowConfigurer().setShowPerspectiveBar(true);
         getWindowConfigurer().setShowProgressIndicator(true);
         getWindowConfigurer().setTitle("Hello RCP"); //$NON-NLS-1$
    }
}
