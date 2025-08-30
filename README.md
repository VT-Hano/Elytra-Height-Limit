-----

# ElytraHeightLimit

A lightweight and simple plugin for Spigot/Paper servers, designed to control the maximum flight height for players using an elytra.

-----

## 🚀 Features

  * ✅ **Configurable Height Limit:** Prevents players from flying with an elytra above a configurable Y-level.
  * ✅ **Action Bar Notifications:** Displays a customizable warning message on the action bar when a player reaches the limit.
  * ✅ **Bypass Permission:** Allows admins or special ranks to ignore the height limit with a permission node.
  * ✅ **Reload Command:** Instantly reloads the plugin's configuration without needing a server restart.
  * ✅ **Fully Customizable:** All messages and settings can be easily modified in the `config.yml`.
  * ✅ **Performance Friendly:** The plugin is very lightweight and only checks players while they are actively gliding, ensuring no impact on server performance.

-----

## 📦 Installation

1.  Download the latest `.jar` file from the [Releases page](https://github.com/VT-Hano/Elytra-Height-Limit/releases/tag/release).
2.  Place the downloaded `.jar` file into your server's `plugins` folder.
3.  Restart or reload your server. The plugin will automatically generate the `config.yml` file.

-----

## ⚙️ Configuration

All configuration is done in the `plugins/ElytraHeightLimit/config.yml` file.

```yml
# =================================================================
# ElytraHeightLimit Configuration
# Plugin Version: 1.0.0
# =================================================================

# The maximum Y-coordinate a player can fly at with an elytra.
# Players flying above this Y-level will have their gliding cancelled.
height-limit: 100

# The message displayed on the action bar when a player exceeds the height limit.
# You can use standard Minecraft color codes with the '&' character.
limit-message: "&c&lWARNING: &fFlight height limit reached!"


# =================================================================
# Command Messages & Permissions
# =================================================================
#
# Commands:
#   /elytraheightlimit reload (Aliases: /ehl reload, /elr reload)
#   - Reloads the configuration file.
#   - Permission: elytraheightlimit.admin
#
# Bypass Permission:
#   elytraheightlimit.bypass
#   - Players with this permission will ignore the height limit entirely.
#   - Recommended for admins or specific ranks.
#
# By default, both permissions are granted to server operators (OPs).
# =================================================================

messages:
  # Message sent when a player does not have permission to use a command.
  no-permission: "&cYou do not have permission to execute this command."
  
  # Message sent to the command user upon a successful reload.
  reload-success: "&a&lSUCCESS! &aThe plugin configuration has been reloaded."
  
  # Message sent when a player uses a command incorrectly.
  # The {label} placeholder will be replaced with the command alias used.
  invalid-usage: "&cInvalid usage. Use: /{label} reload"
```

-----

## 📜 Commands & Permissions

| Command | Aliases | Permission | Description |
| :--- | :--- | :--- | :--- |
| `/elytraheightlimit reload` | `/elr`, `/ehl` | `elytraheightlimit.admin` | Reloads the plugin's configuration file. |

| Other Permission | Description | Default |
| :--- | :--- | :--- |
| `elytraheightlimit.bypass` | Allows the player to bypass the flight height limit. | OP |

-----

## 🐛 Issues & Support

If you encounter a bug or have a feature request, please create an **Issue** on the [GitHub Issues page](https://github.com/VT-Hano/Elytra-Height-Limit/issues).

-----
