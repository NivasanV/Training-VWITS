why mentioning version in maven dependencies it is  recommended  not to mention version number directly in dependency tag
instead write it separately using properties tag as shown below:


maven has three life cycle
	1. clean
	2. default
	3. site

	each life cycle has multiple phases
		Eg: default has following phase (compile, package, install)
	each phase has one are more plugin goal
		Eg: package phase has JAR:JAR plugin goal