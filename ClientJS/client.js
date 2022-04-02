const grpc = require('@grpc/grpc-js')
const loader = require('@grpc/proto-loader')
const package = loader.loadSync('user.proto', {})
const object = grpc.loadPackageDefinition(package)
const userPackage = object.userPackage;

const client = new userPackage.user('localhost:8080', grpc.credentials.createInsecure())


const operation = process.argv[2]

function signUp(username, pass) {
    client.signUp(
        {
            username: username,
            password: pass
        },
        (err, response) => {
            if (err) {
                console.log(err)
            } else {
                console.log(response)
            }
        }
    )
}

function logIn(username, pass) {
    client.logIn(
        {
            username: username,
            password: pass
        },
        (err, response) => {
            if (err) {
                console.log(err)
            } else {
                console.log(response)
            }
        }
    )
}

function logOut() {
    client.logOut(
        {},
        (err, response) => {
            if (err) {
                console.log(err)
            } else {
                console.log(response)
            }
        }
    )
}

function fetchDB() {
    client.fetchDB(
        {},
        (err, response) => {
            if (err) {
                console.log(err)
            } else {
                console.log(response)
            }
        }
    )
}

function updateDB(field, value) {
    client.updateDB(
        {
            field: field,
            value: value
        },
        (err, response) => {
            if (err) {
                console.log(err)
            } else {
                console.log(response)
            }
        }
    )
}

function getSessionUser() {
    client.getSessionUser(
        {},
        (err, response) => {
            if (err) {
                console.log(err)
            } else {
                console.log(response)
            }
        }
    )
}

switch (operation) {
    case 'signup':
        signUp(process.argv[3], process.argv[4])
        break;
    case 'login':
        logIn(process.argv[3], process.argv[4])
        break;
    case 'logout':
        logOut()
        break;
    case 'fetchdb':
        fetchDB()
        break;
    case 'updatedb':
        updateDB(process.argv[3], process.argv[4])
        break;
    case 'who':
        getSessionUser()
        break;
}


