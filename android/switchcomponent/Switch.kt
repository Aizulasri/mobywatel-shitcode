package pl.gov.coi.common.ui.ds.switchcomponent

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import pl.gov.coi.common.ui.ds.switchcomponent.provider.SwitchPreviewParameterProvider
import pl.gov.coi.common.ui.theme.AppTheme

@Composable
fun Switch(
  data: SwitchData,
) {
  when (data) {
    is SwitchData.SwitchOnly -> SwitchOnly(data = data)
    is SwitchData.SwitchWithText -> SwitchWithText(data = data)
    is SwitchData.