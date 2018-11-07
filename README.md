# THEMING A VAADIN APPLICATION

## Introduction
Theming is an important part of every web application. It provides a website with a consistent appearance in all the views, providing the feeling of uniformity and professionality .

Vaadin provides Lumo as a default theme for Vaadin applications. This theme is loaded automatically, if no @Theme or @NoTheme annotation is specified.

Most of the developers who use Vaadin build their themes on top of Lumo, since the alternative is to style every single component from scratch. Another alternative is to base your custom themes on top of other themes, such as Material theme. 

Note: Vaadin Material is a complete theme for Vaadin components, inspired by Google’s Material Design guidelines.

This document does not follow the last approach because it would require styling every single component from scratch.

## Theming approaches
Most Vaadin developers style their applications on top of a predefined theme, such as Lumo.

Vaadin developers follow 2 approaches:
1. Not using the @Theme annotation, Lumo as default:
In this approach, theme modules are imported for the component which shadow dom you want to customize. When the component, e.g. vaadin-button, is rendered, the corresponding Lumo file will be loaded on top.
2. Using the @Theme annotation to load your own theme class that uses specific Lumo modules:
This approach uses the @Theme annotation to switch to a custom theme class, e.g. MyTheme.class. In that class, imports are defined for global html files (i.e. your Lumo variable overrides, global css, and whatnot), and the path from which to load the component styles. It has the disadvantage that it is necessary to create an html file for every single Vaadin component that you want to be supported by the custom theme (MyTheme.class), and import Lumo from there. In this approach, the existing Lumo implementation for that Vaadin component is replaced with the new one (new theme).

Note:
Flow checks if the @Theme annotation is found in the root navigation level (@Route=””). If the annotation is enabled, then theming is enabled. If @NoTheme annotation is found, theming is disabled. In the case that neither of those annotations are defined, com.vaadin.flow.theme.lumo.Lumo is used by default if the Lumo theme is available.

## Which approach is better?
Although using Lumo as a default application theme is more convenient and faster, the option 2 (Use the @Theme annotation to switch to your own theme class, e.g. MyTheme.class) allows to select the Lumo styles/themes that you want to be loaded for each component, reducing the number of styles loaded and giving more control and it provides a better encapsulation of the custom themes with the components.

Option 2 is recommended for full-fledged custom themes.

Note: Lumo only loads the style/themes required for the components that are required.

## Theming issues

Unfortunately, there is a temporal override issue present in both approaches:

The main problem derived from it is that, depending on various factors, the styles that you are overriding in your theme modules for the Vaadin components may or may not override Lumo styles.

When you reload the page you are currently on, the evaluation order can change and suddenly your styles are being overridden and nothing looks right.

This behaviour seems to be nondeterministic, probably due to the way Polymer makes dom modules available for the browser's css evaluation.

For further information about this issue, check the open tickets about them:
1. https://github.com/vaadin/flow/issues/4602
2. https://github.com/vaadin/vaadin-themable-mixin/issues/28
3. https://github.com/vaadin/vaadin-themable-mixin/issues/13

## Workaround
The only available solution for this override issue is to declare CSS rules whose weight is bigger than the Lumo properties that are being overridden.

Notice that trying to increase the weight of a CSS rule like this :host(vaadin-button) will not change the selection in any way, since the theme-for attribute probably already limits the styles to vaadin-button, but it does increase specificity. 

:host(vaadin-button) only works in Chrome. In other browsers that need shimming, it does not work (e.g. FF62).

Note:
 - Use the :host pseudo-class selector to target styles in the element that hosts the component (as opposed to targeting elements inside the component's template).
 - The :host selector is the only way to target the host element.

There are other ways to increase the specificity than just the tag selector.
For example, you could use :host([tabindex]), as all buttons have a tabindex. That should work in all supported browsers.

Trying to increase the specificity of the CSS rules to override Lumo has the disadvantage that it requires developers to go through the implementation of the component. 

The only reliable solution that works in all the cases is to put !important on every line that needs to override Lumo.


## IDE
Import the project to the IDE of your choosing as a Maven project.
 
## Run application

To run the application in development time, enter the following Maven
command:  
```
mvn spring-boot:run
```

Open [http://localhost:8080/](http://localhost:8080/) in browser to see
the application.
