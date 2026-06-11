# Subscription Tracker 📱

追踪和管理你的所有订阅服务，避免费用超支。

[![Android Build](https://github.com/你的用户名/SubscriptionTracker/actions/workflows/build.yml/badge.svg)](https://github.com/你的用户名/SubscriptionTracker/actions/workflows/build.yml)
[![Platform](https://img.shields.io/badge/platform-Android-blue.svg)](https://developer.android.com/)
[![API](https://img.shields.io/badge/API-24%2B-brightgreen.svg)](https://android-arsenal.com/api?level=24)

## ✨ 功能特性

- 📊 **费用统计** - 查看月度/年度订阅支出
- ➕ **添加订阅** - 快速记录新订阅
- 📱 **Material Design 3** - 现代化 UI 设计
- 🌙 **深色模式** - 支持系统主题
- 💾 **数据持久化** - 本地存储，安全可靠

## 📥 下载

### 最新构建

从 [GitHub Actions](https://github.com/你的用户名/SubscriptionTracker/actions) 下载最新 APK：

1. 访问 Actions 页面
2. 点击最新的 workflow run
3. 在底部找到 **Artifacts**
4. 点击 `app-debug` 下载

### 发布版本

从 [Releases](https://github.com/你的用户名/SubscriptionTracker/releases) 下载稳定版本。

## 🏗️ 构建说明

### 环境要求

- JDK 17
- Android SDK 34
- Gradle 8.4

### 编译步骤

```bash
# 克隆仓库
git clone https://github.com/你的用户名/SubscriptionTracker.git
cd SubscriptionTracker

# 编译 Debug 版本
./gradlew assembleDebug

# APK 位置
app/build/outputs/apk/debug/app-debug.apk
```

### 使用 GitHub Actions

Push 到 main 分支会自动触发编译：

```bash
git push origin main
```

然后在 [Actions](https://github.com/你的用户名/SubscriptionTracker/actions) 页面下载 APK。

## 📱 截图

![主界面](docs/screenshots/home.png)

## 🛠️ 技术栈

- **语言**: Kotlin
- **UI**: Jetpack Compose + Material 3
- **架构**: MVVM
- **最低版本**: Android 5.0 (API 24)
- **目标版本**: Android 14 (API 34)

## 📄 开源协议

MIT License

## 🤝 贡献

欢迎提交 Issue 和 Pull Request！

## 📞 联系方式

- 问题反馈：[GitHub Issues](https://github.com/你的用户名/SubscriptionTracker/issues)

---

_Built with ❤️ by APP Factory_
