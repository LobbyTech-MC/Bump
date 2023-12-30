package io.github.slimefunguguproject.bump.core;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.ParametersAreNonnullByDefault;

import org.bukkit.NamespacedKey;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.slimefunguguproject.bump.api.appraise.AppraiseType;
import lombok.Getter;
import lombok.Setter;
import net.guizhanss.guizhanlib.slimefun.addon.AddonConfig;

/**
 * This class holds {@link Map Maps} and {@link List Lists} related to Bump.
 *
 * @author ybw0014
 */
public final class BumpRegistry {
    // config
    @Getter
    private final AddonConfig config;

    // appraise
    @Getter
    private final Map<NamespacedKey, AppraiseType> appraiseTypeKeys = new HashMap<>();
    @Getter
    private final Set<AppraiseType> appraiseTypes = new HashSet<>();
    @Getter
    private final Map<Byte, Byte> starThresholds = new LinkedHashMap<>();

    // language
    @Getter
    @Setter
    private String language;

    @ParametersAreNonnullByDefault
    public BumpRegistry(JavaPlugin plugin, AddonConfig config) {
        this.config = config;
    }

	public Map<Byte, Byte> getStarThresholds() {
		// TODO Auto-generated method stub
		return starThresholds;
	}

	public Map<NamespacedKey, AppraiseType> getAppraiseTypeKeys() {
		// TODO Auto-generated method stub
		return appraiseTypeKeys;
	}

	public Set<AppraiseType> getAppraiseTypes() {
		// TODO Auto-generated method stub
		return appraiseTypes;
	}

	public void setLanguage(String lang) {
		// TODO Auto-generated method stub
		this.language = lang;
	}

	public AddonConfig getConfig() {
		// TODO Auto-generated method stub
		return config;
	}

	public String getLanguage() {
		// TODO Auto-generated method stub
		return language;
	}
}
