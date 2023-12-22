--- Testing ---
  Testing esentil for the quality of the product we developing
  - It is very essential that we write lot of unit test for our application
  - To exactly do this, React application recommends a seperate file known as 'test file'
    for ever component
  - convention for file name is component_name.test.js

  Code Coverage :
    - It is a metric that helps us to understand how much of our code is tested.
    - You can specify the minimun threshold, if that is not met such code is not allowed
      to push it for production or in repository
    - Steps to followed:
      1. Add new script in package.json
          "coverage":"react-scripts test --coverage"
      2. Add following configuration in package.json