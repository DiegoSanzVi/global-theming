package petshop.ui;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the contact-information.html template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("contact-information")
@HtmlImport("src/contact-information.html")
public class ContactInformation extends PolymerTemplate<ContactInformation.ContactInformationModel> {

    /**
     * Creates a new ContactInformation.
     */
    public ContactInformation() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between ContactInformation and contact-information.html
     */
    public interface ContactInformationModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
