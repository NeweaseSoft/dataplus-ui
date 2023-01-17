# dataplus-ui

## Development Environment

| Software        | Version    |
|-----------------|------------|
| jdk             | 1.8        |
| gwt             | 2.10.0     |
| domino-ui       | 1.0.0-RC16 |

## Project Setup

```
mvn gwt:generate-module gwt:devmode
```

### Compile and Hot-Reload for Development

```
mvn gwt:devmode
```

or

```
mvn gwt:codeserver
```

## Project Structure

```
dataplus-ui
├── pom.xml
└── src
    └── main
        └── java
            └── com.neweasesoft.dataplus.ui
                └── backstage
                    ├── client
                    ├── public
                    ├── server
                    ├── shared
                    └── Backstage.gwt.xml
```

## Customize configuration

See [GWT Official Document](https://www.gwtproject.org/).
