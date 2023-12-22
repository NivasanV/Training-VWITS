Angular
    -Angular is framwork which uses typescrit as language
    -Angular can be brodly divided into following 2 categories:
        1. Angular1 : which is actually used to called as AngularJS
                      which was using JavaScript as language
                      this is out dated and nobody uses into
        2. Angular  : which is Angular2 and above
                     which uses typescrit as language

    -Softwares needed
        1. Node
        2. Angular CLI
    -To install Angular CLI we must write following command:
        $ npm install -g @angular/cli
    -To check whether it is installed or not
        $ ng version
    
commands:
    -To create Angular project
        $ ng new project_name
    -To run the project
        $ cd project_name
        $ ng serve 
        ng serve command runs a development server on port 4200

    -To check the running project
        http://localhost:4200
    
Directory Structure
    1. src/app      : This directory contains angular source code
    2. assets       : Assets contains static file such as images
    3. node_module  : This folder contains all the download dependencies

Angular supports modular Structure which is reusable
    -As we know in web application development HTML, CSS, JS files are needed.
    -These 3 files together logically build application
    -Angular takes this idea ahead and divide whole application into small independent
    usable unit.
    -Each independent unitis knows as component
    -Each component consist of following files:
        HTML, CSS, TS, spec.ts
    -The convention for thes file names are as follows:
        component_name.html     : This GUI foe the component
        component_name.css      : This decides the style for the GUI for the component
        component_name.ts       : This file is used to write the functionality of the components we 
        component_name.spec.ts  : This is used to write unit test cases
    -Example:
        home.component.html
        home.component.css
        home.component.ts
        home.component.spec.ts

    -Each components is stored in its own folder

    -A component is a typescrit class decorated with @Component.
    -Each component is uniquely identified by assigning unique logical name to that component
    -Each name is known as selctor
    -Naming convention foe selctoros app-component_name
    -This selctor now can be used as HTML tag in any HTML whenever needed ant no of times

    -when the component is ready we must make sure that its entry is done in app.module.ts file
    -Manually carrying out steps

