----------------------NodeJs-------------------
- Open source cross platform javascript runtime environment.
- Chrome's V8 engine is at core of NodeJs engine.
Modules:

1. It is reusable code.
2. In Node each file is treated as a separate module.
3. There are three types of modules:

    a. Custom Module: User defined modules. 
    b. Built-in Module: Module which comes with node installation.
    c. Third-party Module: Created by developers. 
        EX: Frequently used open source modules.
 
CommonJs:

-To use a module inside another file, NodeJs uses the syntax
given by CommonJs.
-CommonJs is a project for standardizing module system for JavaScript.
-At the time of release NodeJs, JavaScript was not supporting module 
system. 
-In CommonJs, to use a module outside the file, you can use 'require'.
-While writing require, we can optionally write '.js' also. Generally, 
'.js' extension is avoided. 
-From ES6 and above JavaScript started supporting module system.
-Which is known as ESModule.

-In ES6, to use modules you have to use 'export', 'import'.
 like 1


When importing built-in modules of node , it is strongly recommended
to prefix it with (node:) .It will increase readability of application
let fs= require('fs')          //valid but not recommended 
let fs= require('node.fs')     //recommended

In fs module, every method is by default asynchronous.
To have synchronous calls, there is alternative 'sync' method present

writeHead() - it returns status code and content type

Create a http server which returns a student info in form of JSON when client 
request .
NOTE: Create hard coded JSON file.
HINT: Use fs module