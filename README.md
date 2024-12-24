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
<h4 style="bold">1. Clone the repository</h4>

Copy code
<br> git@github.com:TiagoElvas/Films-Reminder.git
<br> cd film-reminder-app

<h4 style="bold">2. Configure Database Connection</h4>
Ensure you have a relational database set up. You can configure your database connection in the persistence.xml file located in the src/main/resources/META-INF directory. 
Update the:
<br> 1 - javax.persistence.jdbc.url, 
<br> 2 - javax.persistence.jdbc.user, and
<br> 3 - javax.persistence.jdbc.password
<br>
<br>properties according to your database setup.

<h4 style="bold">3. Build the Project</h4>
Use Maven to build and install the necessary dependencies.
<br> - mvn clean install
<h4 style="bold">4. Run the Application</h4>
To start the terminal application, run the following command:
<br>
<br> - mvn exec:java -Dexec.mainClass="com.yourpackage.Main"
<br>
<br>This will launch the terminal-based interface where you can interact with the app.

Once the application is running, you will be prompted with the following options:
<br>
<ol>
  <li>List Films</li>
  <li>Add Film</li>
  <li>Delete Film</li>
  <li>Exit</li>
</ol>

