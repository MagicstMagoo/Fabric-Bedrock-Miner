package yan.lx.bedrockminer.utils;

// work status
public enum Status {
    // init
    INITIALIZATION,

    // fin piston
    FIND_PISTON_POSITION,
    // find redstone torch
    FIND_REDSTONE_TORCH_POSITION,

    // place piston
    PLACE_PISTON,

    // place slime block
    PLACE_SLIME_BLOCK,

    // place redstone torch
    PLACE_REDSTONE_TORCH,

    // extended
    EXTENDED_START,

    // piston move
    PISTON_MOVING,

    // wait update
    WAIT_GAME_UPDATE,

    // timeout
    TIME_OUT,

    // failed
    FAILED,
    // item recycling
    ITEM_RECYCLING,
    // finish
    FINISH,
}