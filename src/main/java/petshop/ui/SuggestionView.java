package petshop.ui;

import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the suggestion-view.html template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("suggestion-view")
@HtmlImport("src/views/suggestion-view.html")
@Route("suggestion")
public class SuggestionView extends PolymerTemplate<SuggestionView.SuggestionViewModel> {

    /**
     * Creates a new SuggestionView.
     */
    public SuggestionView() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between SuggestionView and suggestion-view.html
     */
    public interface SuggestionViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
