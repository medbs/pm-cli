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