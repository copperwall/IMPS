build:
	javac ImpsTools.java Imps.java

clean:
	rm *.class

doc:
	mkdir docs
	javadoc -d docs ImpsTools.java
