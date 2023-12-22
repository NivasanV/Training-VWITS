const GoogleStrategy = require('passport-google-oauth20').Strategy
const passport = require('passport');

const secrete = require('./clientSecrete')

const client_Id = secrete.CLIENT_ID
const client_Secret = secrete.CLIENT_SECRETE

passport.use(new GoogleStrategy({ // npm i passport-google-oauth20
    clientID: client_Id,
    clientSecret: client_Secret,
    callbackURL: "/auth/google/callback"
},
    function (accessToken, refereshTocke, profile, done) {
        console.log('In verify')
        done(null, profile)
    }
))

passport.serializeUser((user, done) => {
    done(null, user)
})

passport.deserializeUser((user, done) => {
    done(null, user)
})