Author: Christoph Woschek<br>
Date: 24.09.2021

<H1>Description</H1>

<H2>Overview</H2>

Java GUI application to convert data from password manager "enpass" to "keepassxc".<br>
Input file: JSON export file from "enpass"<br>
Output file: CSV file to inport into "keepassxc"

<H2>Dependencies</H2>
<li>JDK: tested with OpenJDk 16.0.1</li>
<li>libs: </li>
<li>https://github.com/stleary/JSON-java.git: json-java.jar Tag 20210307</li>
<li>https://commons.apache.org/proper/commons-io/: Apache Commons IO 2.11.0</li>

<H2>How to run it</H2>

clone repo:
<pre>
git clone https://github.com/cwoschek/ConvertEnpass2KeepassXC.git
</pre>

change into directory:
<pre>
cd ConvertEnpass2KeepassXC
</pre>

run with gradle:
<pre>
./gradlew run
</pre>
