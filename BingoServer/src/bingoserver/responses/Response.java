/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingoserver.responses;

import org.json.simple.JSONObject;

/**
 *
 * @author 15096134
 */
public abstract class Response {

    public abstract JSONObject responseJson();

    public String responseData() {
        return responseJson().toJSONString();
    }
}
