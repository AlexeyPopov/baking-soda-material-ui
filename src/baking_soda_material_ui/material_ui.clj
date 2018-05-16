(ns baking-soda-material-ui.material-ui)

(def material-ui-tags
  '[AppBar
    Avatar
    Backdrop
    Badge
    BottomNavigation
    BottomNavigationAction
    Button
    ButtonBase
    Card
    CardActions
    CardContent
    CardHeader
    CardMedia
    Checkbox
    Chip
    CircularProgress
    ClickAwayListener
    Collapse
    CssBaseline
    Dialog
    DialogActions
    DialogContent
    DialogContentText
    DialogTitle
    Divider
    Drawer
    ExpansionPanel
    ExpansionPanelActions
    ExpansionPanelDetails
    ExpansionPanelSummary
    Fade
    FormControl
    FormControlLabel
    FormGroup
    FormHelperText
    FormLabel
    Grid
    GridList
    GridListTile
    GridListTileBar
    Grow
    Hidden
    Icon
    IconButton
    Input
    InputAdornment
    InputLabel
    LinearProgress
    List
    ListItem
    ListItemAvatar
    ListItemIcon
    ListItemSecondaryAction
    ListItemText
    ListSubheader
    Menu
    MenuItem
    MenuList
    MobileStepper
    Modal
    ModalManager
    NativeSelect
    Paper
    Popover
    Portal
    Radio
    RadioGroup
    Select
    Slide
    Snackbar
    SnackbarContent
    Step
    StepButton
    StepContent
    StepIcon
    StepLabel
    Stepper
    SvgIcon
    SwipeableDrawer
    Switch
    Table
    TableBody
    TableCell
    TableFooter
    TableHead
    TablePagination
    TableRow
    TableSortLabel
    Tabs
    Tab
    TextField
    Toolbar
    Tooltip
    Typography
    withMobileDialog
    withWidth
    Zoom
    ])


(defn create-material-ui-component [tag]
  `(def ~tag (reagent.core/adapt-react-class
              (aget js/MaterialUI ~(name tag)))))


(defmacro export-material-ui-components []
  `(do ~@(map create-material-ui-component
              material-ui-tags)))
