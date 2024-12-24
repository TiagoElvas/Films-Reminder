<h1 align="center">Film Reminder App</h1>
A simple terminal-based film reminder application that allows you to list, add, or delete films. This app utilizes JPA (Java Persistence API) to manage film data and perform CRUD operations. It's a basic project designed to demonstrate the usage of JPA in a terminal environment.

<h2>Features</h2>
<ul>
<li>List Films: View all films currently in your reminder list.</li>
<li>Add Film: Add a new film to the list.</li>
<li>Delete Film: Remove a film from the list.</li>
<li>Persistence: All films are stored in a relational database using JPA.</li>
</ul>

<h2>Requirements</h2>
<ul>
<li>Java 8 or higher;</li>
<li>Maven (for dependency management);</li>
<li>A relational database (e.g. MySQL);</li>
<li>JPA provider (e.g., Hibernate);</li>
</ul>

<h2>Setup Instructions</h2>
1. Clone the repository


Copy code
git clone https://github.com/your-username/film-reminder-app.git
cd film-reminder-app
2. Configure Database Connection
Ensure you have a relational database set up. You can configure your database connection in the persistence.xml file located in the src/main/resources/META-INF directory. Update the javax.persistence.jdbc.url, javax.persistence.jdbc.user, and javax.persistence.jdbc.password properties according to your database setup.

Example for H2 Database:

xml
Copy code
<persistence-unit name="filmPU">
    <provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>
    <jta-data-source>java:/jdbc/YourDataSource</jta-data-source>
    <properties>
        <property name="hibernate.dialect" value="org.hibernate.dialect.H2Dialect"/>
        <property name="hibernate.hbm2ddl.auto" value="update"/>
        <property name="hibernate.show_sql" value="true"/>
    </properties>
</persistence-unit>

3. Build the Project
Use Maven to build and install the necessary dependencies.

bash
Copy code
mvn clean install
4. Run the Application
To start the terminal application, run the following command:

bash
Copy code
mvn exec:java -Dexec.mainClass="com.yourpackage.Main"
This will launch the terminal-based interface where you can interact with the app.

Usage
Once the application is running, you will be prompted with the following options:
