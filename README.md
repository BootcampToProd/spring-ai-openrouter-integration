# 🤖 Spring AI + OpenRouter: The Universal LLM Gateway

This repository demonstrates how to integrate **OpenRouter** with **Spring AI**, allowing you to access hundreds of Large Language Models (LLMs) from providers like OpenAI, Google, Anthropic, and many more through a single, unified API. This project showcases the power of switching between different AI models by changing just one line in your configuration file, with zero code modifications.

📖 **Dive Deeper**: For a complete walkthrough, detailed explanations of OpenRouter's benefits, and step-by-step instructions for building this example application, read our comprehensive blog post.<br>
👉 [Integrate OpenRouter with Spring AI: Switch Between 400+ AI Models with Zero Code Changes](https://bootcamptoprod.com/integrate-openrouter-with-spring-ai/)

🎥 **Visual Learning**: Prefer video tutorials? Watch our step-by-step implementation guide on YouTube.<br>
👉 YouTube Tutorial - [OpenRouter + Spring AI: Access 400+ AI Models with One API](https://youtu.be/otZ1TjxL9HI)

---

## 📦 Environment Variables

Make sure to provide this Java environment variable when running the application:

-   `OPENROUTER_API_KEY`: Your secret API key from the OpenRouter.

---

## 💡 About This Project

This project implements a simple **Smart Chat Assistant** to demonstrate the ease of integrating OpenRouter with Spring AI. It showcases how to:

*   Configure Spring AI to use any OpenAI-compatible API endpoint.
*   Use a single `ChatClient` to access a vast array of models.
*   Switch between different LLMs (e.g., from a free model to a paid one like GPT-4o) just by editing the `application.yml` file.

The application exposes a simple REST endpoint that takes a user's message, sends it to the configured model via OpenRouter, and returns the AI-generated response.

---