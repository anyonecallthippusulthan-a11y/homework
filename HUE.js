// Logger class
class Logger {
    log(message) {
        console.log("LOG:", message);
    }
}

// Inject decorator
function Inject(dependency) {
    return function (target) {
        target.logger = new dependency();
    };
}

// UserService class
@Inject(Logger)
class UserService {
    createUser(name) {
        console.log("User created:", name);

        // Logger is automatically injected
        UserService.logger.log(`User "${name}" was created successfully.`);
    }
}

// Create UserService object
const userService = new UserService();

// Create a user
userService.createUser("Thippu");