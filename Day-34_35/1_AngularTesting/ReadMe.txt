In Angular, each component has 1 test file associated with it,
which has following name convention : 
    componentName.component.spec.ts
Similarly, each service has one test filr associated with it
    serviceName.service.spec.ts
For example: Hello.component.spec.ts    
             Data.service.spec.ts

For writing individual test, we may use following method(which accepts 2 args):
it()
    - 1st argument: user-friendly test name
    - 2nd argument: arrow function
    NOTE: This is similar to tset function in React.
          In react we can also use it() function
          In React we can use it and change interchangeably 

Few othr functions are:

describe- it is used to create a group of test
fdescribe- it is used to tell focus on this group only(meaning execute only this group)
xdescribe- meaning exclude this group from execution
beforeEach()- it excutes before each test cases
aftereach()- it excutes after each test cases
beforeAll()- excutes before All test cases
afterAll()- excutes after all test cases


    To run test cases : in cmd- ng test
It is important to note that while doing unit testing we must not rely on
sequence of the test cases execution.
Because as name specifies , each test is independent of other and hence we 
don't gurantee of any sequence.
NOTE: This is also true for Junit.

ng test --code-coverage
Above command generates a coverage report.
Default location pf report is projectdirectory/coverage/index.html
It is possible to customize the coverage report on different aspect if needed.

Headless- a browser without user interface 
          This type of browsers are used in CI/CD.
