package com.codetoart.r2_streamer.model.tableofcontents;

import com.codetoart.r2_streamer.model.publication.link.Link;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shrikant Badwaik on 27-Feb-17.
 */

public class TOCLink extends Link {
    public String sectionTitle;
    public String playOrder;
    public List<TOCLink> tocLinks;

    public TOCLink() {
        tocLinks = new ArrayList<>();
    }

    public TOCLink(String sectionTitle, String playOrder, List<TOCLink> tocLinks) {
        this.sectionTitle = sectionTitle;
        this.playOrder = playOrder;
        this.tocLinks = tocLinks;
    }

    public String getSectionTitle() {
        return sectionTitle;
    }

    public void setSectionTitle(String sectionTitle) {
        this.sectionTitle = sectionTitle;
    }

    public String getPlayOrder() {
        return playOrder;
    }

    public void setPlayOrder(String playOrder) {
        this.playOrder = playOrder;
    }

    public List<TOCLink> getTocLinks() {
        return tocLinks;
    }

    public void setTocLinks(List<TOCLink> tocLinks) {
        this.tocLinks = tocLinks;
    }
}