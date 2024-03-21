package net.dkebnh.bukkit.MaintenanceMode.placeholder;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import net.dkebnh.bukkit.MaintenanceMode.MaintenanceMode;
import org.jetbrains.annotations.NotNull;
import org.bukkit.OfflinePlayer;


public class PlaceholderManager extends PlaceholderExpansion {
    public MaintenanceMode plugin;
    public PlaceholderManager(final MaintenanceMode plugin) {
        this.plugin = plugin;
    }
    public String onRequest(final OfflinePlayer player, final String identifier) {
        if (identifier.equals("mode")) {
            return plugin.getSelectedMode();
        }
        else if (identifier.equals("status")) {
            return String.valueOf(plugin.getEnabled());
        }
        return null;
        }

    @Override
    public @NotNull String getIdentifier() {
        return "MaintenanceMode";
    }
    @Override
    public @NotNull String getAuthor() {
        return "AddstarMC";
    }
    @Override
    public @NotNull String getVersion() {
        return plugin.getDescription().getVersion();
    }
    @Override
    public boolean persist() {
        return true; // This is required or else PlaceholderAPI will unregister the Expansion on reload
    }
}