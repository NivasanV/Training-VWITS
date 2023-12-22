Routing:
  It is used to for navigation
  It enables navigation by intrapreting url as instruction to change view
  Every component is associated with one uniqe url
  following are the steps involved
	1.Declare a array of object to map path(url with a component) in app.routes.ts file
	2.Mention this provider of the routes inside app.config.ts file
	3.Write following tag in app component html file
	  <router-outlet>
	4.Instead of href attribute use routerLink attribute and specify url as mention the first step
	5.Import RouterModule in the component needed

Protected Routes
	-while working in production there are many routes which must not be public
	accessible , in other words , before accessing those routes we must check few things,
	For Example : whether user has logged in, in that case we protect the routes and 
	check the condition before allowing user to access those routes. If the condition is
	not satisfied , we can route the user to different page.

steps to be followed:
	1. create off guard service using following command
		$ ng generate guard nameOfTheService
	2. check the condition we are intrested in
		If the condition is satisfied, it return true
		If the condition is not satisfied route the user and return false
	3. in apt.routes.ts file protect the routes by adding
	one more property canActivate and specify the name of the AuthGuard service class
