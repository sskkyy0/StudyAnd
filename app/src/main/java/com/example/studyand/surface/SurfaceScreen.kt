package com.example.studyand.surface

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SurfaceScreen(name: String) {
    Surface(
        modifier = Modifier.padding(5.dp)
    ) {
        Text(
            text = "Hello $name!",
            modifier = Modifier.padding(8.dp)
        )
    }

    // 스텝 1: Surface에 elevation을 설정합시다.

    // 스텝 2: border의 값을 설정해봅시다.

    // 스텝 3: Surface의 shape도 설정해봅시다.

    // 스텝 4: color를 지정합시다.
    // MaterialTheme.colors에서 primary, error,
    // background, surface, secondary 등을 지정해봅시다.
    // contentColor가 자동으로 선택됩니다.
}

@Preview(showBackground = true)
@Composable
private fun SurfaceScreenPreview() {
    SurfaceScreen("Hello")
}