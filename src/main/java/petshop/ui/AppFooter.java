package petshop.ui;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the app-footer.html template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("app-footer")
@HtmlImport("src/app-footer.html")
public class AppFooter extends PolymerTemplate<AppFooter.AppFooterModel> {

    /**
     * Creates a new AppFooter.
     */
    public AppFooter() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between AppFooter and app-footer.html
     */
    public interface AppFooterModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
