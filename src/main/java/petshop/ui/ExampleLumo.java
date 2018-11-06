package petshop.ui;

import java.util.ArrayList;
import java.util.List;

import org.jfairy.Fairy;
import org.jfairy.producer.person.Person;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.polymertemplate.Id;
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

    @Id("vaadinGrid")
    private Grid<Person> vaadinGrid;

    private final Fairy fairy = Fairy.create();

    /**
     * Creates a new SuggestionView.
     */
    public ExampleLumo() {

        vaadinGrid.addColumn(Person::firstName).setHeader("Name");
        vaadinGrid.addColumn(Person::lastName).setHeader("Surname");

        List<Person> people = new ArrayList<Person>();
        // You can initialise any data required for the connected UI components here.
        for (int i = 0; i  < 100; i++) {
            people.add(fairy.person());
        }

        vaadinGrid.setItems(people);
    }

    /**
     * This model binds properties between SuggestionView and suggestion-view.html
     */
    public interface SuggestionViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
