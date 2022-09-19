import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String args[]) throws JsonProcessingException  //static method
    {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory().disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER));



        Staff staff = new Staff();
        staff.version = "1.0";

        Worker albert = new Worker("36k",true);
        Worker joseph = new Worker("96k",false);


        JsonNode staffNode = mapper.valueToTree(staff);

        ObjectNode workerNode = mapper.createObjectNode();

        Map<String,Worker> workers = new HashMap<>();
        workers.put("Albert",albert);
        workers.put("Joseph",joseph);
        for(String name: workers.keySet()){
            ((ObjectNode)workerNode).set(name,mapper.valueToTree(workers.get(name)));
        }

        ((ObjectNode)staffNode).set("workers",workerNode);


        final String result = mapper.writeValueAsString(staffNode);



        System.out.println(result);
    }
}
