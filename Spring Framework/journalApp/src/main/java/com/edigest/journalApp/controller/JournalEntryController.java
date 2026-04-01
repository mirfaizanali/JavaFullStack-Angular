package com.edigest.journalApp.controller;

import com.edigest.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.JobOriginatingUserName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {
        private Map<Long, JournalEntry> journalEntries = new HashMap<>();

        @GetMapping
        public List<JournalEntry> getAll(){
            return new ArrayList<>(journalEntries.values());
        }

        @PostMapping
        public boolean createEntry(@RequestBody JournalEntry myEntry){
            journalEntries.put(myEntry.getId(), myEntry);
            return true;
        }

        @GetMapping("id/{myId}")
        public JournalEntry getJournalEntry(@PathVariable long myId){
            return journalEntries.get(myId);
        }

        @DeleteMapping("id/{myId}")
        public JournalEntry deleteJournalEntry(@PathVariable long myId){
            return journalEntries.remove(myId);
        }

        @PutMapping("id/{id}")
        public JournalEntry updateEntry(@PathVariable Long id,@RequestBody JournalEntry myEntry){
           return journalEntries.put(id,myEntry);
        }
}
