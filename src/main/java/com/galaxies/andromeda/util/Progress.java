
package com.galaxies.andromeda.util;

/**
 * Para mustrar el prgreso de una actividad
 * @author Azael Reyes
 */
public abstract class Progress implements Runnable
{
    /**
     * Indica el estado actual de la actividad
     * @param progress indicador numerico el estado actual
     * @param message descripcion del paso realizado
     */
    public abstract void setProgress(int progress, String message);
}
