------ REST------
REpresentational State Transfer(REST)
-It is an arcetectural style of building appication if used with web service
it is called as RestWeb service
-to check if our webservice RESTtull or not richardson maturity model is used
has which following leveles
	lovel 0 -> is not RESTfull (not recommended)
	level 1 -> resource based uri
	level 2 -> usage of appropriate http methods and http status codes
	level 3 -> HATEOAS(Hypertext As The Engine Of Application State)

as a application developer it is our responsiblity to make sure
our RESTfull service must be as RESTfull as possible (level 3 or atleast level 2 not less
than than)

-------------------------------------------------------------------------------------------

------HTTP Status Code----

200 - ok (used for GET method & PUT method)
201 - created (used for POST method)
204 - not content (DELETE)

404 - resources not found
401 - un-auth (when user is not passing credential or wrong)
403 - forbidden (when user has no access for resource)
400 - bad-request (when server is accepting input, but not passed any)
405 - client not allowed (client is requesting for methods which server is not supporting)

500 - internal server error (some issue on the server side)










