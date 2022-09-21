# dataplus-ui

## Development Environment

| Software | Version  |
|----------|----------|
| node     | v16.15.1 |
| npm      | 8.11.0   |
| vue      | 3.2.39   |

## Project Setup

```
npm install
```

### Compile and Hot-Reload for Development

```
npm run dev
```

### Type-Check, Compile and Minify for Production

```
npm run build
```

### Lint with [ESLint](https://eslint.org/)

```
npm run lint
```

## Project Structure

```
dataplus-ui                       # 项目名称
├── public                        # 公共目录
│   ├── favicon.ico
│   └── index.html
├── src                           # 源代码目录
│   ├── assets                    # 静态资源目录
│   ├── components                # 公共组件目录
│   ├── App.vue                   # 基础组件
│   └── main.js                   # 项目入口文件
├── .browserslistrc               # 浏览器兼容配置
├── .eslintrc.js                  # ESlint 规则配置文件
├── README.md                     # 项目介绍文件
├── babel.config.js               # Babel 配置文件
├── jsconfig.json                 # JS 配置文件
├── package-lock.json             # 锁定安装时的包的版本号，以确保其他人在 npm install 时下载的依赖是一致的
├── package.json                  # 依赖包管理文件
└── vue.config.js                 # Vue 配置文件
```

## Customize configuration

See [Vite Configuration Reference](https://vitejs.dev/config/).
