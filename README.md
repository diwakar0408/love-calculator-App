# 💘 Love Calculator App

A simple Spring MVC-based web application that calculates relationship compatibility between two people using the classic **FLAMES algorithm**. This project is ideal for understanding the flow of Spring MVC, form submissions, validation, and result rendering using JSP.

---

## 📌 Project Description

This Love Calculator application takes input from users (two names), processes it using the **FLAMES logic**, and returns a relationship prediction such as **Friendship, Love, Affection, Marriage, Enemy, or Sister**.

Additionally, it showcases real-world implementation of:
- Spring MVC framework
- Form handling with DTOs
- Input validation (including custom validators)
- Custom property editors and formatters
- Email service integration
- Web application packaging using WAR

---

## 🛠️ Technologies Used

| Technology           | Purpose/Usage                                  |
|----------------------|-------------------------------------------------|
| **Java**             | Backend development language                    |
| **Spring MVC**       | Web framework (Controllers, Views, Request Flow)|
| **Apache Maven**     | Dependency and project management (`pom.xml`)   |
| **JSP**              | View technology (rendering responses)           |
| **Servlet API**      | Underlying HTTP handling                        |
| **Javax Validation** | Input validation using annotations              |
| **Custom Validators**| `@Age` validator and input pre-processing       |
| **Custom Editors**   | `NameEditor`, `PhoneFormatter`                  |
| **Email API**        | For sending results or communication messages   |
| **Eclipse IDE**      | Project developed using Eclipse IDE             |

---

## 📂 Project Structure

```
love-calculator-App/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com.diwakartech.lc/
│   │   │       ├── controllers/
│   │   │       ├── services/
│   │   │       ├── DTO/
│   │   │       ├── Validators/
│   │   │       ├── config/
│   │   │       ├── editors/
│   │   │       └── formatter/
│   │   └── webapp/
│   │       └── WEB-INF/
│   │           └── JSP pages
│
├── pom.xml
└── README.md
```

---

## ⚙️ Features

- 🔢 FLAMES algorithm logic implementation
- 📝 Form input using Spring `@ModelAttribute` with DTOs
- ✅ Custom input validation (e.g., age validation)
- 📨 Email sending functionality
- 🧹 Custom formatting and input sanitization
- 🔁 MVC structure with clean separation of concerns
- 🌐 Deployable as a `.war` file on servlet containers like Tomcat

---

## 📈 Business Logic (FLAMES)

- Removes common characters between two names
- Counts remaining characters
- Uses that count to cycle through FLAMES:
  - **F**: Friends
  - **L**: Love
  - **A**: Affection
  - **M**: Marriage
  - **E**: Enemy
  - **S**: Sister

The final character represents the predicted relationship.

---

## 🚀 How to Run

### Prerequisites:
- Java 8+
- Apache Maven
- Tomcat 9+
- Eclipse/IntelliJ (optional)

### Steps:
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/love-calculator-App.git
   cd love-calculator-App
   ```

2. Import into Eclipse/IntelliJ as a **Maven project**.

3. Build the project:
   ```bash
   mvn clean install
   ```

4. Deploy the `WAR` file to a servlet container like Tomcat.

5. Access the app at:
   ```
   http://localhost:8080/love-calculator/
   ```

---

## 👨‍💻 Author

**Undalu Diwakar**  
Java Full Stack Developer  
[LinkedIn](#) | [GitHub](#)

---

## 📜 License

This project is licensed under the MIT License - feel free to use and modify for learning or fun.
