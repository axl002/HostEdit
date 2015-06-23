# HostEdit
A program to edit the HOSTS file for windows, purpose is to block websites

HostEdit is a java program that adds URLs to your HOSTS file with 0.0.0.0 string appended to the front of the URL. This will block the added URLs making this an effective method of blocking unwanted websites. The URLs are added to the end of your HOSTS file so this program is compatible with HOSTS files that have already been modified. This program may require you to disable your antivirus to run as many AV software prevent modification of the HOSTS file. The source code of this program is viewable and it is recommended you compile this program yourself, this way it is 100% safe and trustworthy.


How to edit the path to your HOSTS file:
*This step is mandatory if your HOSTS file is not in: "C:/Windows/System32/drivers/etc/HOSTS"

1. Open HostEdit.java in a text editor program 
2. Find the line that says: static final String HOSTPATH = "C:/Windows/System32/drivers/etc/HOSTS";
3. Edit the file path to match where your HOSTS file is stored.
4. Save and close HostEdit.java


How to compile from java source:
*This requires java and java compiller installed on your computer

1. Open command prompt (press windows key + r, type cmd)
2. Change directory to the directory where you downloaded HostEdit
3. Type javac HostEdit.java
4. If all goes well a new file called HostEdit.class will be created
5. Finished!

How to run:

1. Open addTheseURLS.txt and add any urls you want to block.
	For example if you want to block www.facebook.com add facebook.com to the text file
	Put one URL per line
	You do not need to write "http://" or "www"
	Do not end URLs with the slash (/) character i.e. example.com/
	Use example.com instead
	
2. Save and close addTheseURLs.txt
3. Open command prompt in the folder where the file HostEdit.class resides
	(hold shift in the folder, right click, select "Open command window here)
4. Type java HostEdit
5. Check your HOSTS file by opening it in a text editor program and verify that the URLs you added are present
6. you may need to clear your browser cache for changes to take effect
7. If successful, the URLs added to the HOSTS file will not be accessible anymore

How to remove URLs:
*URLs must be deleted from the HOSTS file manually.

1. Open your HOSTS file in a text editor program
2. Delete the lines for websites that you want to be able to access
3. Save and close your HOSTS file
