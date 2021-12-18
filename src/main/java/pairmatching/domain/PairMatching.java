package pairmatching.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class PairMatching {
    private static final HashMap<String, List<String>> MatcingTable = new HashMap<>();
    private static final List<Crew> frontendCrews = new ArrayList<>();
    private static final List<Crew> backendCrews = new ArrayList<>();

    public PairMatching() {
    }

    public static List<Crew> frontendCrews() {
        return Collections.unmodifiableList(frontendCrews);
    }
    public static List<Crew> backendCrews() {
        return Collections.unmodifiableList(backendCrews);
    }

    public static void initCrews() throws IOException {
        initFrontendCrews();
        initBackendCrews();
    }

    private static void initFrontendCrews() throws IOException {
        File path = new File("src/main/resources");
        BufferedReader br = new BufferedReader(new FileReader(path.getAbsolutePath() + "/frontend-crew.md"));
        while(true) {
            String name = br.readLine();
            if (name==null) break;
            frontendCrews.add(new Crew(name, "프론트엔드"));
        }
        br.close();
    }

    private static void initBackendCrews() throws IOException {
        File path = new File("src/main/resources");
        BufferedReader br = new BufferedReader(new FileReader(path.getAbsolutePath() + "/backend-crew.md"));
        while(true) {
            String name = br.readLine();
            if (name==null) break;
            backendCrews.add(new Crew(name, "백엔드"));
        }
        br.close();
    }

    public static void addPairMatching(String key, List<String> value) {
        MatcingTable.put(key, value);
    }

    public static boolean existPairMatching(String key) {
        for (String tableKey : MatcingTable.keySet()) {
            if(tableKey.equals(key)) {
                return true;
            }
        }
        return false;
    }
}