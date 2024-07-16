# Smart-Home-Control-System

### Demo video coming soon of project working live in my apartment :) ###

SmartHomeHub is a smart home control system using Raspberry Pi as the cntral hub, integrating IoT(Internet of Things) devices like motion sensors, LED lights, smart bulbs, an Echo Dot, and a ring camera. The system uses JavaFX for the GUI (Graphical User Interface) for control and monitoring.

## Technologies Used

### Raspberry Pi
The Raspberry Pi serves as our smart home hub. It runs our Java application, communicates with IoT devices via WiFi and Bluetooth, and uses MQTT for messaging between devices.

### Spring Boot
We're using Spring Boot to structure our Java application. It handles device connections, manages our business logic, and provides a web server for any web-based features we might add.

### JavaFX
JavaFX is powering our graphical user interface. We're building a dashboard where users can monitor and control all their smart home devices in one place.

### Pi4J
Pi4J allows our Java code to interact with the Raspberry Pi's hardware. We're using it to control LED lights and read data from sensors connected directly to the Pi.

### Eclipse Paho (MQTT)
We're using Eclipse Paho to implement MQTT communication in our system. This lets us send commands to smart bulbs and receive updates from various sensors efficiently.

### Amazon Alexa Skills Kit
The Alexa Skills Kit is helping us integrate voice control. We're creating custom voice commands to control our smart home devices through an Echo Dot.

### Ring API (unofficial)
We're using an unofficial Ring API to interface with the Ring camera. This allows us to access the camera feed and receive event notifications.

### Philips Hue API
The Philips Hue API is our way of controlling smart light bulbs. We're using it to adjust brightness, color, and power states of the lights in our smart home setup.

### Java Development Kit (JDK)
We're using Java to develop our entire application. The JDK provides the core tools for Java development and runtime environment for our application.

### Maven
Maven is our build automation and project management tool. We're using it to manage our project's dependencies and build process.

### Git
We're using Git for version control, allowing us to track changes, collaborate, and manage different versions of our codebase.

### H2 Database (or SQLite)
We're using a lightweight database to store device configurations and historical data. This allows our system to persist important information between runs.

### SLF4J with Logback
For logging and debugging, we're implementing SLF4J with Logback. This helps us track system activities and troubleshoot issues efficiently.

### mDNS (Multicast DNS)
We're using mDNS for local device discovery. This allows our system to automatically find and connect to compatible smart devices on the local network.
