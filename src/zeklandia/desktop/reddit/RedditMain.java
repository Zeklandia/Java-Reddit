package zeklandia.desktop.reddit;

import org.fusesource.jansi.AnsiConsole;
import zeklandia.desktop.logger.JLogger;
import zeklandia.desktop.reddit.client.RedditClientMain;

public class RedditMain {

	public static final Boolean time = false;
	public static final String app = "JRedditClient";
	private static final String classname = "RedditMain";
	private static final String padding = "       ";
	public static final String banner = "                   [0;1;36;96m#[0m      [0;1;33;93m#[0m    [0;1;36;96m\"[0m      [0;1;33;93mm[0m   \n"
		+ "  [0;1;32;92mm[0m [0;1;36;96mmm[0m   [0;1;35;95mm[0;1;31;91mmm[0m    [0;1;36;96mmm[0;1;34;94mm#[0m   [0;1;31;91mm[0;1;33;93mmm[0;1;32;92m#[0m  [0;1;36;96mm[0;1;34;94mmm[0m    [0;1;33;93mmm[0;1;32;92m#m[0;1;36;96mm[0m \n"
		+ "  [0;1;36;96m#\"[0m  [0;1;35;95m\"[0m [0;1;31;91m#\"[0m  [0;1;32;92m#[0m  [0;1;36;96m#[0;1;34;94m\"[0m [0;1;35;95m\"#[0m  [0;1;33;93m#\"[0m [0;1;32;92m\"[0;1;36;96m#[0m    [0;1;35;95m#[0m      [0;1;36;96m#[0m   \n"
		+ "  [0;1;34;94m#[0m     [0;1;33;93m#\"[0;1;32;92m\"\"[0;1;36;96m\"[0m  [0;1;34;94m#[0m   [0;1;31;91m#[0m  [0;1;32;92m#[0m   [0;1;34;94m#[0m    [0;1;31;91m#[0m      [0;1;34;94m#[0m   \n"
		+ "  [0;1;35;95m#[0m     [0;1;32;92m\"#[0;1;36;96mmm[0;1;34;94m\"[0m  [0;1;35;95m\"[0;1;31;91m#m[0;1;33;93m##[0m  [0;1;36;96m\"#[0;1;34;94mm#[0;1;35;95m#[0m  [0;1;31;91mm[0;1;33;93mm#[0;1;32;92mmm[0m    [0;1;35;95m\"m[0;1;31;91mm[0m ";

	public static void main(String[] args) {
		JLogger.prepareConsole();
		JLogger.logMessage(time, app, classname, padding, "Program Started");
		AnsiConsole.system_out.println(banner);
		RedditClientMain.main();
	}
}
