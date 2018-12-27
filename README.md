# Program Manager cli

##Prerequisites

* java 8
* consul

## How do I get set up?

**Run Consul**

One way to run consul is using dev mode:

 ```bash
consul agent -dev -ui
```

**Build the project**
```bash
./gradlew build
```

**Run as executable jar**
```bash
java -jar build/libs/*.jar
```

## How do I use it ?
**Display available commands**
```
help
```

**Execute command with default arguments**
```
basic-url
```

**Execute command with customized arguments**

***Using parameter key***
```bash
basic-url --key pm/settings/gateway/keycloak/basic_url --value http://ipaddress/au
```

***Without parameter key (Parameters order should  be respected)***
```bash
basic-url pm/settings/gateway/keycloak/basic_url http://ipaddress/au
```