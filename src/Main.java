import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        final ProcessKiller processKiller = new ProcessKiller();
        final Alam alam = new Alam();
        try {
            while (true) {
                Process process = Runtime.getRuntime().exec("tasklist");
                List<String> gameList = processKiller.getTargetProcesses();
                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                String processName;


                while ((processName = reader.readLine()) != null) {
                    for (String target : gameList) {
                        if (processName.toLowerCase().contains(target)) {
                            processKiller.gameKill(processName);
                            alam.warning();

                        }
                    }
                }
                Thread.sleep(1000); // Add delay to avoid excessive CPU usage
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
