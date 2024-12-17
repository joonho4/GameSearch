
import java.io.IOException;

import java.util.List;
import java.util.Arrays;

public class ProcessKiller {

    private static final List<String> TARGET_PROCESSES = Arrays.asList(
            "psychengine", "mindustry", "muck",
            "djmax", "dance", "geometrydash",
            "snb", "minecraft", "betgame",
            "portal2", "tekken", "valorant", "league"
    );

    public List<String> getTargetProcesses() {
        return TARGET_PROCESSES;
    }

    public void gameKill(String processName) throws IOException {
        processName = processName.split("   ")[0];
        if (processName.contains(".e") || processName.contains(".exe")) {
            processName = processName.replace(".e", "");
            processName = processName.replace(".exe", "");
        }


        String command = "taskkill /FI \"IMAGENAME eq " + processName + ".exe\"";
        Runtime.getRuntime().exec(command);
    }
}
