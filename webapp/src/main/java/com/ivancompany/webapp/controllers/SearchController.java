package com.ivancompany.webapp.controllers;

import com.ivancompany.dao.AbstractBaseDao;
import com.ivancompany.model.song;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class SearchController extends AbstractDBController {

    public SearchController() throws SQLException {
        super();
    }

    @GetMapping("/search")
    public Map<String, ArrayList<AbstractBaseDao>> search(@RequestParam String searchTerm) throws SQLException {
        /*
        return the top n results (we're thinking n = 3) in each of  songs, artists, albums, and playlists
         */
        Map<String, ArrayList<AbstractBaseDao>> map = new HashMap<>();
        List<AbstractBaseDao> currentList = new ArrayList<>();
        //TODO: use song, artist, album and playlist daos to return top 3 of each.

        return map;
    }

}
