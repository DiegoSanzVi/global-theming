package petshop.ui;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the suggestion-view.html template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("example-lumo")
@HtmlImport("src/views/example-lumo.html")
@Route("lumo")
public class ExampleLumo extends PolymerTemplate<ExampleLumo.SuggestionViewModel> {

    /**
     * Creates a new SuggestionView.
     */
    public ExampleLumo() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between SuggestionView and suggestion-view.html
     */
    public interface SuggestionViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
