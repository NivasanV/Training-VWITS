----------REST call---------------
In production application data is always stored on server which needs to be fetched
by client application such as angular and react.
React on its own does not have any support for REST calls but can make use of third party
libraries or javascript built-in support.
Following are 2 popular approaches to make REST calls from React:
  1. Fetch API:
    It is built-in to javascript hence we dont have to install any additional libraries
    but dealing with such API's is error prone and complex as we have to deal with 2 
    promises.
    Hence other open source libraries are used.
  2.AXIOS API:
    AXIOS is the most popular library.
    To use AXIOS we must first install it using following command:
        npm install axios