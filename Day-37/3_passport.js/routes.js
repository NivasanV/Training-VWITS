const router = require("express").Router();
const passport = require("passport");

router.get("/auth/google", passport.authenticate("google", {
    scope: ["profile"]
}))

router.get("/auth/google/callback", passport.authenticate("google", {
    successRedirect: 'http://localhost:5000/welcome',
    failureRedirect: 'http://localhost:5000/goback'
}))

router.get('/welcome', (req, res) => {
    console.log(req.user)
    res.send('welcome ' + req.user.displayName)
})

router.get('/goback', (req, res) => {
    res.send('plz try again ')
})

module.exports = router