import org.json.JSONArray;
import org.json.JSONObject;
import tparser.core.JsonDelegate;

@SuppressWarnings("unused")
public class JSONDelegate implements JsonDelegate<JSONObject, JSONArray> {
    @Override
    public JSONObject createObjectNode() {
        return new JSONObject();
    }

    @Override
    public JSONArray createArrayNode() {
        return new JSONArray();
    }

    @Override
    public void putValue(JSONObject jsonObject, String key, Object value) {
        jsonObject.put(key, value);
    }

    @Override
    public void putNull(JSONObject jsonObject, String key) {
        jsonObject.put(key, JSONObject.NULL);
    }

    @Override
    public void putObjectNode(JSONObject jsonObject, String key, JSONObject value) {
        jsonObject.put(key, value);
    }

    @Override
    public void putArrayNode(JSONObject jsonObject, String key, JSONArray value) {
        jsonObject.put(key, value);
    }

    @Override
    public void add(JSONArray array, JSONObject item) {
        array.put(item);
    }
}
